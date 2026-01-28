class User {
    String name;
    int age;
    String email;

    User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Email: " + email);
        System.out.println("----------------");
    }
}


