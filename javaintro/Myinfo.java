package com.javaintro;

import java.util.Scanner;

public class Myinfo {

    static void displayName(String name) {
        System.out.println("Name : " + name);
    }

    static void displayAge(int age) {
        System.out.println("Age : " + age);
    }

    static void displayGender(String gender) {
        System.out.println("Gender : " + gender);
    }

    static void displayMobile(long mobile) {
        System.out.println("Mobile : " + mobile);
    }

    static void displayEmail(String email) {
        System.out.println("Email : " + email);
    }

    static void displayCity(String city) {
        System.out.println("City : " + city);
    }

    static void displayState(String state) {
        System.out.println("State : " + state);
    }

    static void displayCountry(String country) {
        System.out.println("Country : " + country);
    }

    static void displayQualification(String qualification) {
        System.out.println("Qualification : " + qualification);
    }

    static void displayCollege(String college) {
        System.out.println("College : " + college);
    }

    static void displayBranch(String branch) {
        System.out.println("Branch : " + branch);
    }

    static void displaySemester(int sem) {
        System.out.println("Semester : " + sem);
    }

    static void displaySection(String section) {
        System.out.println("Section : " + section);
    }

    static void displayRollNumber(String roll) {
        System.out.println("Roll Number : " + roll);
    }

    static void displayPercentage(double per) {
        System.out.println("Percentage : " + per);
    }

    static void displayCGPA(double cgpa) {
        System.out.println("CGPA : " + cgpa);
    }

    static void displayFatherName(String father) {
        System.out.println("Father Name : " + father);
    }

    static void displayMotherName(String mother) {
        System.out.println("Mother Name : " + mother);
    }

    static void displayNationality(String nationality) {
        System.out.println("Nationality : " + nationality);
    }

    static void displayReligion(String religion) {
        System.out.println("Religion : " + religion);
    }

    static void displayBloodGroup(String blood) {
        System.out.println("Blood Group : " + blood);
    }

    static void displayHeight(double height) {
        System.out.println("Height : " + height);
    }

    static void displayWeight(double weight) {
        System.out.println("Weight : " + weight);
    }

    static void displayLanguage1(String lang) {
        System.out.println("Language 1 : " + lang);
    }

    static void displayLanguage2(String lang) {
        System.out.println("Language 2 : " + lang);
    }

    static void displayLanguage3(String lang) {
        System.out.println("Language 3 : " + lang);
    }

    static void displaySkill1(String skill) {
        System.out.println("Skill 1 : " + skill);
    }

    static void displaySkill2(String skill) {
        System.out.println("Skill 2 : " + skill);
    }

    static void displaySkill3(String skill) {
        System.out.println("Skill 3 : " + skill);
    }

    static void displayHobby1(String hobby) {
        System.out.println("Hobby 1 : " + hobby);
    }

    static void displayHobby2(String hobby) {
        System.out.println("Hobby 2 : " + hobby);
    }

    static void displayFavoriteColor(String color) {
        System.out.println("Favorite Color : " + color);
    }

    static void displayFavoriteFood(String food) {
        System.out.println("Favorite Food : " + food);
    }

    static void displayFavoriteGame(String game) {
        System.out.println("Favorite Game : " + game);
    }

    static void displayDreamCompany(String company) {
        System.out.println("Dream Company : " + company);
    }

    static void displayGoal(String goal) {
        System.out.println("Goal : " + goal);
    }

    static void displayExperience(String exp) {
        System.out.println("Experience : " + exp);
    }

    static void displayProject(String project) {
        System.out.println("Project : " + project);
    }

    static void displayCertification(String cert) {
        System.out.println("Certification : " + cert);
    }

    static void displayGithub(String github) {
        System.out.println("GitHub : " + github);
    }

    static void displayLinkedIn(String linkedin) {
        System.out.println("LinkedIn : " + linkedin);
    }

    static void displayStrength(String strength) {
        System.out.println("Strength : " + strength);
    }

    static void displayWeakness(String weakness) {
        System.out.println("Weakness : " + weakness);
    }

    static void displayAddress(String address) {
        System.out.println("Address : " + address);
    }

    static void displayPincode(int pin) {
        System.out.println("Pincode : " + pin);
    }

    static void displayDOB(String dob) {
        System.out.println("Date of Birth : " + dob);
    }

    static void displayMaritalStatus(String status) {
        System.out.println("Marital Status : " + status);
    }

    static void displayPassport(String passport) {
        System.out.println("Passport : " + passport);
    }

    static void displayAadhar(long aadhar) {
        System.out.println("Aadhar : " + aadhar);
    }

    static void displayDrivingLicense(String dl) {
        System.out.println("Driving License : " + dl);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Enter Mobile : ");
        long mobile = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Email : ");
        String email = sc.nextLine();
        
        System.out.print("Enter city : ");
        String city = sc.nextLine();
        
        System.out.println("Enter state:");
        String state = sc.nextLine();
        
        System.out.println("enter country:");
        String Country = sc.nextLine();
        
        System.out.println("Enter Qualification:");
        String Qualification = sc.nextLine();
        
        System.out.println("Enter College Name:");
        String College = sc.nextLine();
        
        System.out.println("Enter the Branch:");
        String Branch = sc.nextLine();
        
        System.out.println("Enter the semster:");
        int semester = sc.nextInt();
        
        System.out.println("Enter the section:");
        String Section = sc.nextLine();

        System.out.println("Enter the RollNumber:");
        String RollNumber = sc.nextLine();

        System.out.println("Enter the Percentage:");
        double percentage = sc.nextDouble();

        System.out.println("Enter the CGPA:");
        double Cgpa = sc.nextDouble();
        sc.nextLine(); // Add this

        System.out.println("Enter the FatherName:");
        String FatherName = sc.nextLine();

        System.out.println("Enter the MotherName:");
        String MotherName = sc.nextLine();
        

        System.out.println("\n------ MY INFORMATION ------");

        displayName(name);
        displayAge(age);
        displayGender(gender);
        displayMobile(mobile);
        displayEmail(email);
        displayCity(city);
        displayState(state);
        displayQualification(Qualification);
        displayCollege(College);
        displayBranch(Branch);
        displaySemester(semester);
        displaySection(Section);
        displayRollNumber(RollNumber);
        displayPercentage(percentage);
        displayCGPA(Cgpa);
        displayFatherName(FatherName);
        displayMotherName(MotherName);

        

        sc.close();
    }
}