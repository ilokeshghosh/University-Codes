class Node:
  def __init__(self, data):
    self.data = data
    self.next = None


class LinkedList:
  def __init__(self):
    self.head = None

 
  def push_back(self, newElement):
    newNode = Node(newElement)
    if(self.head == None):
      self.head = newNode
      return
    else:
      temp = self.head
      while(temp.next != None):
        temp = temp.next
      temp.next = newNode


  def push_at(self, newElement, position):     
    newNode = Node(newElement) 
    if(position < 1):
      print("\nposition should be >= 1.")
    elif (position == 1):
      newNode.next = self.head
      self.head = newNode
    else:    
      temp = self.head
      for i in range(1, position-1):
        if(temp != None):
          temp = temp.next   
      if(temp != None):
        newNode.next = temp.next
        temp.next = newNode  
      else:
        print("\nThe previous node is null.")


  def PrintList(self):
    temp = self.head
    if(temp != None):
      print("The list contains:", end=" ")
      while (temp != None):
        print(temp.data, end=" ")
        temp = temp.next
      print()
    else:
      print("The list is empty.")

               
MyList = LinkedList()


MyList.push_back(80)
MyList.push_back(30)
MyList.push_back(20)
MyList.PrintList()


MyList.push_at(100, 3)
MyList.PrintList() 

MyList.push_at(400, 1)
MyList.PrintList()  