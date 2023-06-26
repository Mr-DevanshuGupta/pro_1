#include <iostream>
using namespace std;

// Definition of a linked list node
struct node
{
    int data;
    node *next;
};

// Function to print the elements of a linked list
void printlinkedlist(node *head)
{
    node *current = head;
    while (current != NULL)
    {
        cout << current->data;
        current = current->next;
    }
}

node *createlinklist()
{
    node *head = NULL;
    node *current = NULL;

    int data;
    char choice;

    do
    {
        node *newnode = new node;

        cout << "entre the elements in the node " << endl;
        cin >> newnode->data;
        newnode->next = NULL;
        if (head == NULL)
        {
            head = newnode;
            current = newnode;
        }
        else
        {
            current->next = newnode;
            current = newnode;
        }
        cout << "did you want to insert a newnode y/n" << endl;
        cin >> choice;
    }
}

int main()
{
    node *head = createlinklist();
    printlinkedlist(head);

    node *current = head;
    while (current != NULL)
    {
        node *temp = current;
        current = current->next;
        delete temp;
    }

    return 0;
}