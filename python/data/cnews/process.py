# coding: utf-8

origin_txt = "cnews.test.txt_old"

train = "cnews.train.txt"
test = "cnews.val.txt"

def process():
    with open(origin_txt, "r+") as input:
        tr_f = open(train, "w+")
        te_f = open(test, "w+")
        index = 0

        for line in input.readlines():
            if index%10 == 0:
                te_f.write(line)
            else:
                tr_f.write(line)
            index += 1
        tr_f.close()
        te_f.close()

process()