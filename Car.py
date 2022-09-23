
lines = []

with open('cars.txt') as file:
    lines = file.readlines()
    lines = [line.rstrip() for line in lines]

with open('output.txt', 'w') as f:
    for line in lines:
        name =  input("\nCar name for %s:\n" %line)
        if name == 'quit':
            print("Exiting!")
            exit()
        brand = input("\nCar brand for %s:\n" %line)
        if brand == 'quit':
            print("Exiting!")
            exit()
        category = input("\nCar category for %s (compacts, sedans, suvs, coupes, muscle, sports, super, motorcycle, offroad, industrial, utility, vans, cycles, boats, planes, service, emergency, military, commercial, trains):\n" %line)
        if category == 'quit':
            print("Exiting!")
            exit()
        f.write('-- %s\n\n' %line)
        f.write('[\'%s\'] = {\n' %line)
        f.write('[\'name\'] = \'%s\',\n' %name)
        f.write('[\'brand\'] = \'%s\',\n' %brand)
        f.write('[\'model\'] = \'%s\',\n' %line)
        f.write('[\'price\'] = \'99999\', -- EDIT ME\n')
        f.write('[\'category\'] = \'%s\',\n' %category)
        f.write('[\'hash\'] = `%s`,\n' %line)
        f.write('[\'shop\'] = \'pdm\',\n')
        f.write('},\n')
        f.write('\n')
        print(line)

print(lines)
print("Done.")
input()