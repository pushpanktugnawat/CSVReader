import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UserCountOnWebsite {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter file path");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.next());
        System.out.println("Please enter file spilator");
        String spillator = scanner.next();
        System.out.println("number of users visited "+ countNoOfUsers(file, spillator));
    }

    public static int countNoOfUsers(File file, String spilator) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = bufferedReader.lines().skip(1).collect(Collectors.toList());
        Set<String> hashset = new HashSet<>();
        lines.forEach((String line) -> {
            String[] arr = line.split(spilator);
            if (arr.length == 3 && Collections.frequency(List.of(arr), "") == 0){
                hashset.add(arr[0]+arr[1]);
            }
        });
        bufferedReader.close();
        return hashset.size();
    }

}
