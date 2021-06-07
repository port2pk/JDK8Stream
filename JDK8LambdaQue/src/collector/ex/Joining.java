package collector.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {
		List NameList=Arrays.asList("Arpit","John","Martin");
        // Counting
        String  stringWithHyphen = (String) NameList.stream().collect(Collectors.joining("-"));
        System.out.println("String with hyphen : "+stringWithHyphen);
        String  stringWithHyphenAndPrefixAndSuffix = (String) NameList.stream().collect(Collectors.joining("-","==","=="));
        System.out.println("String with hyphen , suffix and prefix :  "+stringWithHyphenAndPrefixAndSuffix);
	}

}
