from Contact import Contact


class AddressBook:
    def __init__(self):
        self.__ContactList:list=[]
        self.__emailList:list=[]

    def createContact(self,name,email,phone):
        contact=Contact(name,email,phone)
        self.__emailList.append(email)
        self.__ContactList.append(contact)

    def deleteContact(self,email:str):
       if email in self.__emailList:
           for contact in self.__ContactList:
               if email==contact.email:
                   self.__ContactList.remove(contact)
                   print("contact removed!....")
                   break
       else:
           print("There is no contact with given email!...")

    def displayContact(self):
        print("----------------Available Contact--------------------")
        for c in self.__ContactList:
            print("Name of Contact = "+c.name)
            print("Phone number of Contact = "+c.phoneNo)
            print("\n")

