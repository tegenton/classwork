fragments = []
nextFragment = ''

while nextFragment != 'quit':
    nextFragment = input("Enter a fragment or quit to exit")
    if nextFragment != 'quit':
        fragments.append(nextFragment)

print(fragments)
