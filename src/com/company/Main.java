package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("echo \"# GitCommands\" >> README.md");
        System.out.println("git init");
        System.out.println("git add README.md");
        System.out.println("git commit -m 'first commit' ");
        System.out.println("git branch -M main");
        System.out.println("git remote add origin https://github.com/newtonkarumba/GitCommands.git");
        System.out.println("git push -u origin main");

    }
}
