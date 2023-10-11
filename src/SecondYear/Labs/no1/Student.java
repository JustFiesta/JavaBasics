package SecondYear.Labs.no1;

import java.time.LocalDate;

public class Student {
    private String name, lastname;
    private Long albumNumber;
    private LocalDate creationDate;

    public Student(String name, String lastname, Long albumNumber) {
        this.name = name;
        this.lastname = lastname;
        this.albumNumber = albumNumber;
        this.creationDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + name + '\'' +
                ", nazwisko='" + lastname + '\'' +
                ", nralbumu=" + albumNumber +
                ", dataUtworzenia=" + creationDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Long getAlbumNumber() {
        return albumNumber;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAlbumNumber(Long albumNumber) {
        this.albumNumber = albumNumber;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
