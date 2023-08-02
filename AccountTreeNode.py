# import random
#
# WebList = ['a','b','c','d']
# WebNum = len(WebList)
# PutOrder = random.sample(range(0, WebNum), WebNum)
# PutList = []
#
# for i in range(0, WebNum):
#     PutList.append(WebList[PutOrder[i]])
#     i += 1
# print(PutList)


#########################################################

# OrderList = {'a': ['b','c'],
#              'b': ['d','e'],
#              'c': ['a','d'],
#              'd': ['b'],
#              'e': ['a','b','c']}


def LeafNodeSize(OrderList, Deep):
    Sum = 0
    PutItem = {}
    TranList = []
    Multiple = []
    LengthOrderList = len(OrderList)
    KeyList = tuple(OrderList.keys())



    for i in range(0, LengthOrderList):
        Long = 1
        PutItem[0] = KeyList[i]

        while Long < Deep:
            TranList.clear()
            if 'a' in PutItem[Long - 1]:
                Multiple = PutItem[Long - 1].count('a') * OrderList['a']
                TranList.extend(Multiple)

            if 'b' in PutItem[Long - 1]:
                Multiple = PutItem[Long - 1].count('b') * OrderList['b']
                TranList.extend(Multiple)

            if 'c' in PutItem[Long - 1]:
                Multiple = PutItem[Long - 1].count('c') * OrderList['c']
                TranList.extend(Multiple)

            if 'd' in PutItem[Long - 1]:
                Multiple = PutItem[Long - 1].count('d') * OrderList['d']
                TranList.extend(Multiple)

            if 'e' in PutItem[Long - 1]:
                Multiple = PutItem[Long - 1].count('e') * OrderList['e']
                TranList.extend(Multiple)

            PutItem[Long] = tuple(TranList)
            Long += 1

        Sum += len(PutItem[Long - 1])
        # print(len(PutItem[Long - 1]))
        PutItem.clear()

# Multiple = KeyList[0].count('a') * OrderList['a']
# TranList.extend(Multiple)
# print(TranList)
# PutItem[1] = TranList
# print(PutItem[1])
# TranList.clear()
# print(PutItem[1])
# Multiple = PutItem[1].count('b') * OrderList['b']
# TranList.extend(Multiple)
# print(TranList)
# Multiple = PutItem[1].count('c') * OrderList['c']
# TranList.extend(Multiple)
# print(TranList)
#
# for i in range(0,LengthOrderList): #If Deep has been revised, there will be revised to len(OrderList)
#     Long = 1
#     IncreaseNum = 0
#     PutItem[0] = KeyList[i]
#
#     while Long < Deep :
#         TranList.clear()
#         if 'a' in PutItem[Long-1] :
#             Multiple = PutItem[Long-1].count('a') * OrderList['a']
#             TranList.extend(Multiple)
#
#
#         if 'b' in PutItem[Long-1] :
#             Multiple = PutItem[Long - 1].count('b') * OrderList['b']
#             TranList.extend(Multiple)
#
#
#         if 'c' in PutItem[Long-1] :
#             Multiple = PutItem[Long - 1].count('c') * OrderList['c']
#             TranList.extend(Multiple)
#
#
#         if 'd' in PutItem[Long-1] :
#             Multiple = PutItem[Long - 1].count('d') * OrderList['d']
#             TranList.extend(Multiple)
#
#
#         if 'e' in PutItem[Long-1] :
#             Multiple = PutItem[Long - 1].count('e') * OrderList['e']
#             TranList.extend(Multiple)
#
#
#         PutItem[Long] = tuple(TranList)
#         Long += 1
#
#     Sum += len(PutItem[Long-1])
#     # print(len(PutItem[Long - 1]))
#     PutItem.clear()

print('There are %d Different result' % (Sum))


