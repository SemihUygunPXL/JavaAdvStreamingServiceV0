package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLEKIDS(0),
    OLDERKIDS(7),
    TEENS(12),
    MATURE(16);
    private int age;

    Rating(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
