import java.io.File;
import java.io.IOException;

/**
 * Created by 42122 on 2016/4/1.
 *
 * Java File的使用
 *
 * 文件的重命名，删除和创建
 */
public class HelloFile {
    public static void main(String[] args) {


        /**
         * 当只是给出文件的名称，没给出路径的时候
         * 得到的是相对路径，就是工程本身的文件夹下创建文件
         *
         * 填写相对路径的时候，不要以任何符号开头
         *
         */
//        File file=new File("out/hello.txt");

        //..表示上一层目录结构，即是工程的上一层目录结构中创建file
//        File file=new File("../hello.txt");

        //上一层的上一层目录中创建
//        File file=new File("../../hello.txt");

        File file=new File("new Hello.txt");


        //判断file是否存在。

        if (file.exists()){

            /**
             * 重命名文件名称
             * 可以跨文件结构，必须在同一分区的结构下。
             * 同一个盘符，和分区可以这么玩
             */
            File nameto=new File("out/new Hello.txt");
            file.renameTo(nameto);

//            file.delete();
//            System.out.println("文件删除成功");



            //用来判断是文件还是目录
//            System.out.println(file.isFile());
//            System.out.println(file.isDirectory());
        }else {
            System.out.println("文件不存在");
            try {
                file.createNewFile();
                System.out.println("文件已经被创建");
            } catch (IOException e) {
                System.out.println("文件无法被创建");
            }
        }



    }
}
