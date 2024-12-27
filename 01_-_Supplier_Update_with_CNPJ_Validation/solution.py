# File: controller.py

from models import *
from dao import *

def change(self, nameOld, nameNew, cnpjNew, telephoneNew, categoryNew):
        supplierdao_read = SupplierDao.read()

        # supplier_name = list(filter(lambda x: x.name == nameOld, supplierdao_read)
        #A001:
        supplier_name = []
        for i1 in supplierdao_read:
            if i1.name == nameOld:
                supplier_name.append(i1)

        if len(supplier_name) > 0:
            # supplier_cnpj = list(filter(lambda x: x.cnpj == cnpjNew, supplierdao_read))
            supplier_cnpj = []
            for i2 in supplierdao_read:
                if i2.cnpj == cnpjNew:
                    supplier_cnpj.append(i2)

            # supplier_updated = list(map(lambda x: SupplierModel(nameNew, cnpjNew, telephoneNew, categoryNew) if(x.name == nameOld) else x, supplierdao_read))
            if len(supplier_cnpj) == 0:
                for i3 in range(len(supplierdao_read)):
                    if supplierdao_read[i3].name == nameOld:
                        supplierdao_read[i3] = SupplierModel(nameNew, cnpjNew, telephoneNew, categoryNew)
                        print(f'Supplier {nameOld} updated successfully.')
                        break
            else:
                print('The CNPJ already exists.')
        else:
            print('The supplier you want to change does not exists.')

        with open('hd_supplier.txt', 'w') as file:
            for i4 in supplierdao_read:
                file.writelines(i4.name + '|' +
                                i4.cnpj + '|' +
                                i4.telephone + '|' +
                                str(i4.category))
                file.writelines('\n')
