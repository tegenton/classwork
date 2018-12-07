fragments = []
nextFragment = ''

while nextFragment != 'quit':
    nextFragment = input("Enter a fragment or quit to exit: ").lower()
    if nextFragment != 'quit':
        fragments.append(nextFragment)

print(fragments)


for fragment in fragments[:]:
    valid = True
    for letter in fragment:
        if letter not in ['a','t','c','g',]:
            valid = False
    if not valid:
        fragments.remove(fragment)
print(fragments)
