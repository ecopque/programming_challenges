performance = 6 # each liters, 6 square meters

can_liters = 18 # liters / unit price: 4.44
can_price = 80 # unit price.

gallon_liters = 3.6 # liters / unit price: 6.94
gallons_price = 25 # unit price


while True:
    try: 
        area_m2 = float(input('Enter the area in square meters to be painted: '))

        if area_m2 > 0:

            qt_liters = (area_m2 / performance)
            qt_liters_margin = (qt_liters * 1.1) # 10%

            total_cans = (qt_liters_margin // can_liters)
            if qt_liters_margin % can_liters != 0:
                total_cans += 1
            total_price_can = (total_cans * can_price)

            total_gallons = (qt_liters_margin // gallons_price)
            if qt_liters_margin % gallon_liters != 0:
                total_gallons +=1 
            total_price_gallon = (total_gallons * gallons_price)

            # Since cans are cheaper than gallons, try to use as many cans as possible:
            cans_for_combination = (qt_liters_margin // can_liters)
            
            difference = (qt_liters_margin - (cans_for_combination * can_liters))
            gallons_for_combination = (difference // gallon_liters)
            if difference % gallon_liters != 0:
                gallons_for_combination += 1
            
            total_price_combination = ((cans_for_combination * can_price) + (gallons_for_combination * gallons_price))

            # Display the results
            print(f'1. Only 18-liter cans:')
            print(f'Number of cans: {total_cans} can(s)')
            print(f'Total price: R$ {total_price_can:.2f}')

            print(f'\n2. Only 3.6-liter gallons:')
            print(f'Number of gallons: {total_gallons} gallon(s)')
            print(f'Total price: R$ {total_price_gallon:.2f}')

            print(f'\n3. Mixing cans and gallons (for the lowest price):')
            print(f'Number of cans: {cans_for_combination} can(s)')
            print(f'Number of gallons: {gallons_for_combination} gallon(s)')
            print(f'Total price: R$ {total_price_combination:.2f}')

            break

        else:
            print('Please enter a value greater than 0.')

    except ValueError:
        print('Please enter a valid value.')

'''
. Developer: Edson Copque
. Website: https://linktr.ee/edsoncopque
. GitHub: https://github.com/ecopque
. Signal Messenger: ecop.01
'''
