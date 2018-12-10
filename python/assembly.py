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
        if fragmentA[indexA:indexA + len(fragmentB)] == fragmentB[:len(fragmentA) - indexA]:
            return [len(fragmentA) - indexA, fragmentA, fragmentB]
    return [0, fragmentA, fragmentB]

def bestMatch(fragments):
    bestPair = [0, '', '']
    for i in range(0, len(fragmentList) - 1):
        currentPair = matchLength(fragmentList[i:i+2])
        if bestPair[0] < currentPair[0]:
            bestPair = currentPair
    return bestPair

def matchFragments(pair):
    if pair[0] > len(pair[2]):
        return pair[1]
    return pair[1][:len(pair[1]) - pair[0]] + pair[2]

def completeSequence(fragments):
    firstSet = bestMatch(fragments)
    fragments.remove(firstSet[1])
    fragments.remove(firstSet[2])
    sequence = matchFragments(firstSet)
    while True:
        if not fragments:
            return sequence
        nextMatch = matchLength([sequence, fragments[0]])
        for fragment in fragments:
            currentMatch = matchLength([sequence, fragment])
            if currentMatch[0] > nextMatch[0]:
               nextMatch = currentMatch
        fragments.remove(nextMatch[2])
        sequence = matchFragments(nextMatch)

if __name__ == '__main__':
    fragmentList = []
    fragmentList = getInput()
    fragmentList = filterDNA(fragmentList)
    complete = completeSequence(fragmentList)
    print("Completed sequence is:", complete)
