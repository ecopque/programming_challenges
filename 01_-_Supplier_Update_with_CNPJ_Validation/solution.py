# File: controller.py

from models import *
from dao import *

class SupplierController:
    def change(self, nameOld, nameNew, cnpjNew, telephoneNew, categoryNew):
        supplierdao_read = SupplierDao.read()

        supplier_name = []
        for i1 in supplierdao_read:
            if i1.name == nameOld:
                supplier_name.append(i1)

        if len(supplier_name) > 0:
            supplier_cnpj = []
            for i2 in supplierdao_read:
                if i2.cnpj == cnpjNew:
                    supplier_cnpj.append(i2)
            
            if len(supplier_cnpj) == 0:
                supplier_final = []
                for i3 in supplierdao_read:
                    supplier_final.append(SupplierModel(nameNew, cnpjNew, telephoneNew, categoryNew))
                else:
                    supplier_final.append(i3)
            else:
                print('The CNPJ already exists.')
                supplier_final = supplierdao_read
        else:
            print('The supplier you want to change does not exists.')
            supplier_final = supplierdao_read
    
        with open('hd_supplier.txt', 'w') as file:
            for i4 in supplier_final:
                file.writelines(i4.name + '|' + 
                            i4.cnpj + '|' + 
                            i4.telephone + '|' + 
                            i4.category)
                file.writelines('\n')
                print('Method executed successfully.')
