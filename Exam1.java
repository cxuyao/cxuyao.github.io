/*考试一。编写一个代表地址的Address类，地址信息由国家、省份、城市、街道、邮编等组成
 * 可以返回完整地址信息
 */
/**package cn.cxy.oop;
class Address{
	private String country;
	private String province;
	private String city;
	private String street;
	private String post;
	public Address(String country,String province,String city,String street,String post) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.post = post;
	}
	public String getInfo() {
		return "国家为:"+this.country+"、 省份为:"+this.province+"、 城市为:"+
	            this.city+"、 街道为:"+this.street+"、 邮编为:"+this.post;
	}
}
public class Exam1 {
	public static void main(String args[]) {
		System.out.println(new Address("中国","广西","南宁","罗文大道","322223").getInfo());
		
	}
}*/
