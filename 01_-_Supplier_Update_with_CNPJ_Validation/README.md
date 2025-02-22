# Programming Challenge: Supplier Update with CNPJ Validation (Company ID)
Hello, everyone!

Today, I bring you a Python programming challenge for those who like to solve problems in a logical and practical way. The goal is to work with data manipulation and information validation in a supplier registration system. This is a real problem I encountered in a project I'm working on and I decided to turn it into a challenge for you!

This is my first challenge, so please be understanding if anything isn’t perfect. And of course, feel free to point out any mistakes or suggestions. Let's get to the challenge!

## Problem:
You have a supplier database stored in a .txt file (called hd_supplier.txt). Each supplier has the following attributes: name, CNPJ, phone number, and category.

Your task is to create a function that:

1. Search for suppliers by name and store in a list those whose names need to be changed.
2. Checks if the new CNPJ is already in use by another supplier.
3. If the CNPJ is not in use, update the supplier information in a new list with the new details: name, CNPJ, phone number and category.
4. If the CNPJ is already in use, display the message: "The CNPJ is already in use." and do not update.
5. If the supplier with the given name does not exist, display the message: "The supplier you want to modify does not exist." and do not update.
6. If everything is correct, update the supplier in the file and write the complete list back to the hd_supplier.txt file.

## Structure of the 'hd_supplier.txt' File:
- Supplier1|12345678000199|123456789|Category1
- Supplier2|98765432000188|987654321|Category2

## How to Solve:
Use the provided classes to represent the supplier and category data. These classes already have methods to save and read data from the files:

Supplier Model (class SupplierModel) - model.py

    class SupplierModel:
    def __init__(self, name, cnpj, telephone, category):
        self.name = name
        self.cnpj = cnpj
        self.telephone = telephone
        self.category = category

Data Handling Class (class SupplierDao) - dao.py

    class SupplierDao:
    @classmethod
    def save(cls, supplier: SupplierModel):
        with open('hd_supplier.txt', 'a') as file:
            file.writelines(supplier.name + '|' + 
                            supplier.cnpj + '|' + 
                            supplier.telephone + '|' + 
                            supplier.category)
            file.writelines('\n')
        print('Supplier registered successfully.')

    @classmethod
    def read(cls):
        with open('hd_supplier.txt', 'r') as file:
            cls.supplier = file.readlines()

        for i1 in range(len(cls.supplier)):
            cls.supplier[i1] = cls.supplier[i1].replace('\n', '')
        print(cls.supplier)

        for i2 in range(len(cls.supplier)):
            cls.supplier[i2] = cls.supplier[i2].split('|')

        hd_supplier = []
        for i3 in cls.supplier:
            hd_supplier.append(SupplierModel(i3[0], i3[1], i3[2], i3[3]))
        return hd_supplier

## Rules:
1. Use only native Python features for the solution, without the need for external libraries.
2. When solving the challenge, share your solution in the comments below or publish a link to the GitHub repository with your code.

## Do you accept the challenge?
#ProgrammingChallenge #Python #Development #ProgrammingLogic #Challenge #Code #Programming #LinkedIn #CodingChallenge #Developer
