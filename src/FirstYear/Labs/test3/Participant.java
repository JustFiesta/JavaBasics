package FirstYear.Labs.test3;

public class Participant extends Person{
    private String mail;
    private participantCategory status;

    //konstruktor uczestnika ustawiający dane w obiekcie
    Participant(String name, String surname, String mail, participantCategory status){
        setName(name);
        setSurname(surname);
        setMail(mail);
        setStatus(status);
    }

    public String getMail() {
        return mail;
    }

    public participantCategory getStatus() {
        return status;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setStatus(participantCategory status) {
        this.status = status;
    }

    @Override
    public String toString() {
        // nadpisuje toString ale korzysta z toString z klasy abstrakcyjnej
        String nameAndSurname = super.toString();
        String mailAndStatus = mail + ' ' + status;
        String info = nameAndSurname + ' '+ mailAndStatus;
        return info;
    }
}
