## Fundamental Concepts

# The absolute basics
Vim and kakoune are both modal text editors

There is a action mode and insert mode

You always start in action mode and can enter insert mode in a variety of ways,
 the simplest of which is by pressing 'i'
 
Entering insert mode essentially behaves exactly as a plain text editor like notepad on 
 windows, g-edit or sublime where every key types whatever key it is (hitting a types a etc.)
 
Other ways of entering insert mode include:
 I 
 	enters insert mode at the beginning of a line

 a 
 	enter insert mode at the end of your selection

 A
 	enter insert mode at the end of a line

 o and O 
 	enter insert mode after moving your cursor to a new line below and above
 	the line you're on respectively

 c 
 	which enters insert mode after deleting your current selection
	

To enter action mode you hit ESC after already being in insert mode

In action mode you move the cursor with hjkl (left down up right)

You can run commands by hitting :
To save a file you type :w and hit enter
To exit a file you type :q and hit enter
To exit a file and save you can type :wq and hit enter

# Compared to vim

Vim uses objects and verbs

to delete internal philosophy of GNU/Linux in:
`The internal philosophy of GNU/Linux is 'Laugh in the face of danger'.`

Desired text:
 - The philosophy of Linux is 'Do it yourself'.

you type 'd6w' in vim only to realize 

but in kakoune you type '6wd'

Block copying
 - To copy the inside of a block in vim, you utilize the "inside block" object (ib)
and the "yank" word (y)

 - In kakoune you use <a-i> and then select "parenthesis" b,(,)

# Navigation
Navigation actions are very intuitive in kakoune.

Large actions are performed with the go-to (g) menu

gh goes all the way left
gk goes all the way up etc.

there are other commands but we don't need to go in to all of them


Searching in kakoune uses regex. Allowing for simple case-sensitive matching or more complex searches
  search for "Exception"
  search for some regex


# Selection

As we've established, Kakoune is built on the concept of acting on your current selection

Knowing this, Kakoune allows you to select seperate strings using multiple cursors

The simplest way to create a second cursor is by pressing C

This will place a new cursor directly below your cursor, independent from the first one
 Multi-cursors move in sync and every action is performed simultaneously on both cursors


# Alignment

# Buffers


Open a new buffer with:
:e <relative filename>
