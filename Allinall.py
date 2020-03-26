while True:
    try:
        string = input()
        if string is None:
            break
        string = string.split(" ")
        flag = False
        i = 0
        # print(string[0])
        for s1 in string[0]:
            # print(s1)
            if (s1 in string[1]):
                try:
                    j = string[1].index(s1, i, len(string[1]));
                    # print(s1 + str(i) + str(j) + string[1][j])
                    if (s1 == string[1][j]):
                        flag = True
                        i = j + 1
                    else:
                        flag = False
                        break
                except:
                    flag = False
                    break
            else:
                flag = False
                break
    except:
        break
    print("Yes") if flag else print("No")