from Contact import Contact


class AddressBook:
    def __init__(self):
        self.ContactList:list=[]
        self.emailList:list=[]

    def createContact(self,name,email,phone):
        contact=Contact(name,email,phone)
        self.emailList.append(email)
        self.ContactList.append(contact)

    def deleteContact(self,email:str):
       if email in self.emailList:
           for contact in self.ContactList:
               if email==contact.getEmail():
                   self.ContactList.remove(contact)
                   print("contact removed!....")
                   break
       else:
           print("There is no contact with given email!...")


