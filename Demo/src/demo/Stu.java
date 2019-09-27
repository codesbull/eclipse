package demo;
public class Stu {
		private String sno;
		private String sname;
		private boolean ssex;
		private int sage;
		
		public String getSno() {
			return sno;
		}
		public void setSno(String sno) {
			this.sno = sno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public boolean isSsex() {
			return ssex;
		}
		public void setSsex(boolean ssex) {
			this.ssex = ssex;
		}
		public int getSage() {
			return sage;
		}
		public void setSage(int sage) {
			this.sage = sage;
		}
		
		@Override
		public String toString() {
			return "Stu [sno=" + sno + ", sname=" + sname + ", ssex=" + ssex + ", sage=" + sage + "]";
		}	
		
		public static void main(String[] args) {
			Stu s=new Stu();
			s.sno="12345";
			s.sname="ÕÅÈý";
			s.ssex=false;
			s.sage=18;
			System.out.println(s);
		}
}
	
