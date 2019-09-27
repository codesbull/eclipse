package toolclass.demo;
/*随机生成不同格式的验证码
 * 验证码是一种区分用户是计算机还是人的公共全自动程序。
 * 它可以防止恶意破解密码，刷票，论坛灌水等行为，
 * 也可以有效防止某个黑客对某一特定注册用户用特定程序暴力破解方式进行不断的登录尝试
 * */
import java.util.Random;
public class VerificationCode {
	static Random rd=new Random();
	public static void main(String[] args) {
		numCode();
		charCode();
		chineseCode();
		mixCode();
	}
	public static void numCode() {//由0~9组成的全数字验证码
		System.out.print("获取的5位数字验证码:");
		for (int i = 0; i < 5; i++) {
			int n=rd.nextInt(10);
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static void charCode() {//英文字母和标点符号组成的字符验证码
		System.out.print("\n获取的5位字符验证码:");
		for (int i = 0; i < 5; i++) {
			int n=65+rd.nextInt(58);
			System.out.print((char) n+" ");
		}
		System.out.println();
	}
	public static void chineseCode() {//全部由中文组成的验证码
		System.out.print("\n获取的5位汉字验证码:");
		for (int i = 0; i < 5; i++) {
			int n=20000+rd.nextInt(10000);
			System.out.print((char) n+" ");
		}
		System.out.println();
	}
	public static void mixCode() {//字符+数字组成的验证码
		System.out.print("\n获取的5位混合验证码:");
		for (int i = 0; i < 5; i++) {
			int n=rd.nextInt(123);
			if (n<65) {
				System.out.print(n%10+" ");
			} else {
				System.out.print((char)n+" ");
			}
		}
	}
}
