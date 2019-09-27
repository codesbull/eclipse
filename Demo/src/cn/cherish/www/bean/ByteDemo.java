package cn.cherish.www.bean;
public class ByteDemo {
	public static void main(String[] args) {
		byte b=13;//byte 的包装类Byte
		Byte c=12;//在jdk1.5后，基本类型和包装类之间自动转换
		int d=b+c;//两个byte类型的数据相加，每个类型都自动转换成int
		/*
		 * 最大值和最小值绝对值不相等，是因为输出是数值的补码
		 * 计算机操作：加法+移位
		 */
		System.out.println("max of byte:"+Byte.MAX_VALUE);
		System.out.println("min of byte:"+Byte.MIN_VALUE);
		System.out.println("d="+d);

	}

}
