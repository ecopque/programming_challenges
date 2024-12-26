# Programming Challenge: Supplier Update with CNPJ Validation (Company ID)
Hello, everyone!

Today, I bring you a Python programming challenge for those who like to solve problems in a logical and practical way. The goal is to work with data manipulation and information validation in a supplier registration system. This is a real problem I encountered in a project I'm working on and I decided to turn it into a challenge for you!

This is my first challenge, so please be understanding if anything isn’t perfect. And of course, feel free to point out any mistakes or suggestions. Let's get to the challenge!

## Problem:
You have a supplier database stored in a .txt file (called hd_supplier.txt). Each supplier has the following attributes: name, CNPJ, phone number, and category.

Your task is to create a function that:

1. Searches for a supplier by name.
2. Checks if the new CNPJ is already in use by another supplier.
3. If the CNPJ is not in use, update the supplier’s information with the new details: name, CNPJ, phone number, and category.
4. If the CNPJ is already in use, display the message: "The CNPJ is already in use." and do not update.
5. If the supplier with the given name does not exist, display the message: "The supplier you want to modify does not exist." and do not update.
6. If everything is correct, update the supplier in the file and write the complete list back to the hd_supplier.txt file.

## Structure of the 'hd_supplier.txt' File:
- Supplier1|12345678000199|123456789|Category1
- Supplier2|98765432000188|987654321|Category2

## How to Solve:
Use the provided classes to represent the supplier and category data. These classes already have methods to save and read data from the files:

Supplier Model (class SupplierModel) - model.py

    def __init__(self, name, cnpj, telephone, category):
        self.name = name
        self.cnpj = cnpj
        self.telephone = telephone
        self.category = category

Data Handling Class (class SupplierDao) - dao.py

    @classmethod
    def save(cls, supplier: SupplierModel):
        # Save supplier to the file
        with open('hd_supplier.txt', 'a') as file:
            file.writelines(supplier.name + '|' + 
                            supplier.cnpj + '|' + 
                            supplier.telephone + '|' + 
                            supplier.category)
            file.writelines('\n')

    @classmethod
    def read(cls):
        # Read suppliers from the file
        with open('hd_supplier.txt', 'r') as file:
            suppliers = file.readlines()
        
        suppliers = [supplier.replace('\n', '') for supplier in suppliers]
        hd_supplier = []
        for supplier in suppliers:
            parts = supplier.split('|')
            hd_supplier.append(SupplierModel(parts[0], parts[1], parts[2], parts[3]))
        return hd_supplier



## Rules:
1. Use only native Python features for the solution, without the need for external libraries.
2. When solving the challenge, share your solution in the comments below or publish a link to the GitHub repository with your code.

## Do you accept the challenge?
#ProgrammingChallenge #Python #Development #ProgrammingLogic #Challenge #Code #Programming #LinkedIn #CodingChallenge #Developer
