package p1;

public class WebsiteAddress {
	
	public static void main(String[] args) {
		
		String url="https://en.wikipedia.org/wiki/Main_Page";
		String urlsplit[]=url.split("/");
		System.out.println(urlsplit[2]);

	}

}
