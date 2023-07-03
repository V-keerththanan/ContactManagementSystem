import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<Contact> contactList=new ArrayList<Contact>();
    String createNewContact(String name,String email,String pNo){

        try{
            for (Contact c:contactList){
                c.getEmail().equals(email);
                throw new RuntimeException("email already available...");
            }
            Contact contact=new Contact();
            contact.setName(name);
            contact.setEmail(email);
            contact.setPhoneNumber(pNo);

        }catch (Exception e){
            System.out.println(  e.getMessage());
        }
        return "contact created and added to address book";

    }
    public void deleteContact(String email){
        int track=0;
        for(Contact c:contactList){
            if(c.getEmail().equals(email)){
                contactList.remove(c);
                track++;
                break;
            }
        }
        if(track==0){
            System.out.println("There is no such contact with given Email id...!");
        }else{
            System.out.println("Contact removed from address book...!");
        }

    }

    public void displayContact(){
        int i=0;
        System.out.println("#######################CONTACT LIST ########################");
        for(Contact c:contactList){
            i++;
            System.out.println("..............................................");
            System.out.println(i+".");
            this.displayOneContact(c);
            System.out.println("...............................................");

        }
    }

    public void searchContactByName(String name){
        for(Contact c:contactList){
            if(c.getName().contains(name)){
                System.out.println("..............................................");
                this.displayOneContact(c);
                System.out.println("..............................................");
            }
        }

    }

    public void displayOneContact(Contact c){
        System.out.println("Name of person :- "+c.getName());
        System.out.println("Email address :- "+c.getEmail());
        System.out.println("Phone Number :- "+c.getPhoneNumber());

    }


}
