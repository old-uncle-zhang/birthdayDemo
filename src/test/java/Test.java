import com.homework.utils.FileUtil;

/**
 * @author ：old_uncle_zhang
 * @date ：Created in 2019/8/7 21:40
 * @description：
 * @modified By：
 */
public class Test {

    public static void main(String[] args) {
        String s = FileUtil.readSystemPathFile("D:\\Test\\test.txt");
        System.err.println(s);
    }
}
