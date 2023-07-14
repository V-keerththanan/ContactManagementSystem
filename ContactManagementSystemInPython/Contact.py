class Contact:
    def __init__(self,name,email,phone):
        self.__name=name
        self.__email=email
        self.__phoneNo=phone

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self,name):
        self.name=name

    @property
    def email(self):
        return self.__email

    @email.setter
    def email(self,email):
        self.__email=email

    @property
    def phoneNo(self):
        return self.__phoneNo
    @phoneNo.setter
    def phoneNo(self,phoneNumber):
        self.__phoneNo=phoneNumber