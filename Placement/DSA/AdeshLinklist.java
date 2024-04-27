#include <stdio.h>
#include <stdlib.h>
 
struct node
{
    int data;
    struct node* left;
    struct node* right;
};

 
 struct node *prev = NULL; 
 


 
struct node* newNode(int data)
{
    struct node* node = (struct node*)malloc(sizeof(struct node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
 
    return(node);
}
 
int main()
{
  
    struct node *root = newNode(40);
    root->left        = newNode(20);
    root->right       = newNode(60);
    root->left->left  = newNode(10);
    root->left->right = newNode(30);
    root->right->right = newNode(80);
    root->right->right->right = newNode(90);
    
    
	}