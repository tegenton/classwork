def getInput():
    fragments = []
    nextFragment = ''
    while nextFragment != 'quit':
        nextFragment = input("Enter a fragment or quit to exit: ").lower()
        if nextFragment != 'quit':
            fragments.append(nextFragment)
    return fragments

def filterDNA(fragments):
    for fragment in fragments[:]:
        valid = True
        for letter in fragment:
            if letter not in ['a','t','c','g',]:
                valid = False
        if not valid:
            fragments.remove(fragment)
    return fragments

def matchLength(fragments):
    fragmentA = fragments[0]
    fragmentB = fragments[1]
    if fragmentA == fragmentB:
        return [len(fragmentA), fragmentA, fragmentB]
    for indexA in range(0, len(fragmentA)):
        if fragmentA[indexA:] == fragmentB[:len(fragmentA) - indexA]:
            return [len(fragmentA) - indexA, fragmentA, fragmentB]
    return [0, fragmentA, fragmentB]

def bestMatch(fragments):
    bestPair = [0, '', '']
    for i in range(0, len(fragmentList) - 1):
        currentPair = matchLength(fragmentList[i:i+2])
        if bestPair[0] < currentPair[0]:
            bestPair = currentPair
    return bestPair

if __name__ == '__main__':
    fragmentList = []
    fragmentList = getInput()
    fragmentList = filterDNA(fragmentList)
    print(bestMatch(fragmentList))
