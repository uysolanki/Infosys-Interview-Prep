clouds=[0,0,1,0,0,1,0,0]



def playGame(clouds):
    position=0
    jumpCounter=0
    while(position<len(clouds)-1):
        if(position+2< len(clouds) and clouds[position+2]==0):
            position+=2
        else:
            position+=1
        jumpCounter+=1
    return jumpCounter

minJumps=playGame(clouds)
print(minJumps)