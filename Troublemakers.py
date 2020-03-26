
cases = int(input())
for i in range(1, cases + 1):
    conn = {}
    nm = input().split()
    
    for j in range(int(nm[1])):
        line = input().split()
        if(line[0] in conn):
            conn[line[0]].append(line[1])
            initialSize = len(conn[line[0]])
        else:
            conn[line[0]] = [line[1]]
        if(line[1] in conn):
            conn[line[1]].append(line[0])
            initialSize = len(conn[line[1]])
        else:
            conn[line[1]] = [line[0]]
    
    class1 = []
    class2 = []
    sol = ""
    length = 0
    
    for k in range(1,int(nm[0])+1):
        troubleMakerA = 0
        troubleMakerB = 0

        if(str(k) in conn):
            temp = conn[str(k)]
            for l in class1:
                if(l in temp):
                    troubleMakerA+=1
            for l in class2:
                if(l in temp):
                    troubleMakerB+=1

            if(troubleMakerA >= troubleMakerB):
                sol += str(k) + " "
                length += 1
                class2.append(str(k))
            else:
                class1.append(str(k))
        else:
            length += 1
            class2.append(str(k))
            sol += str(k) + " "
            
    print("Case #%s: %s" %(i,length))
    print(sol)