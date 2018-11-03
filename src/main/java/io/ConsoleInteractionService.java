package io;

import java.util.Scanner;

public class ConsoleInteractionService {

    private Scanner scanner = new Scanner(System.in);

    private ConsoleInteractionService(){

    }

    public static ConsoleInteractionService getInstance() {
        return HOLDER.INSTANCE;
    }

    public void print(String line) {
        System.out.println(line);
    }

    public String read() {
        return scanner.nextLine();
    }

    private static class HOLDER {
        private final static ConsoleInteractionService INSTANCE = new ConsoleInteractionService();
    }


}
