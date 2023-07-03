from Contact import Contact


class AddressBook:
    def __init__(self):
        self.ContactList:list=[]

    def createContact(self,name,email,phone):
        contact=Contact(name,email,phone)
        self.ContactList.append(contact)



