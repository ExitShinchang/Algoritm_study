list = []  # 10 20 30 40 50
for i in range(0, 5):
    list.append(int(input()))

list.sort()
# print(list.sort())  #이러면 None 나옴 왜그러냐 개빡치게

hub = 0
for i in range(0, 5):
    hub = hub + list[i]

print(hub//5)
print(list[2])