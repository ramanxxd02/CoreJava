package in.co.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Collections;

public class TestEmail {
	public static void main(String[] args) {
		List<Task> t=new ArrayList<Task>();
		t.add(new Task("ramandange5@gmail.com"));
	   	t.add(new Task("ramandange@gail.com"));
		t.add(new Task("ramandange56@gmail.com"));
		t.add(new Task("ramandange@gmail.com"));
		t.add(new Task("ramandange50@gmail.com"));//this one should be filtered out
		
String gmailPattern="^[A-Za-z0-9+_.-]+@gmail\\.com$";
Pattern pattern=Pattern.compile(gmailPattern);

t.stream().map(e-> e.email)
 .filter(e -> pattern.matcher(e).matches() && e.substring(0, e.indexOf('@')).matches(".*\\d.*"))
.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
	Collections.shuffle(e);
	return e.stream();
})).forEach(e -> {
	System.out.println("Valid gmail is : " + e);
});

	}

}
