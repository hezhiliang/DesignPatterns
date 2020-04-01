## 标题Headings：
# 标题1
## 标题2
### 标题3
#### 标题4
...
######## 标题N

## 段落 Paragraph ：
两段文字之间至少要留有一个空行（回车）

## 字体 Styling Text：

斜体： *This text will be italic*  （对应HTML中的标签）

粗体：**This text will be bold** （对应HTML中的标签）


## 列表 Lists：

####### 无序号的列表 Unordered Lists
* item 
* item
或者
- item
- item

注意： *和-要与列表内容之间要有空格， *是实心的圆点，-是空心的圆点

####### 有序号的列表 Ordered List:s
1. item
2. item

注意： 列表序号与列表内容之间要有空格

####### 嵌套的列表 Nested Lists:
1. item
    1.1 item
    1.2 item    

注意： 嵌套列表要缩进2个空格  indenting list items by two spaces


## 引用 Blockquotes：
引用文字前填加 > （indicate blockquotes with a >）
> 引用文本
 
代码块 Code Block

To produce a code block in Markdown, simply indent every line of the block by at least 4 spaces or 1 tab.
在每行代码前，使用4个空格或者tab缩进。
例如：
####### Title
    if x > y:
        print x
 
####### 代码块
    private static final String test;
    
## 链接 Links：
把链接文字放在中括号[]中，把对应的URL放到小括号()中。（wrapping link text in brackets [ ], and then wrapping the link in parenthesis ( ) ）.

[Sina Blog](blog.sina.com.cn)

[百度](www.baidu.com)

## README.md中添加图片格式如下：

! + [图片描述 ] + (图片的url ) 即：![](img_url)

注意：使用英文输入法；注意不要使用空格；

[]中的描述：图片不存在时，显示的图片说明。

前提：在项目中创建存放截图文件夹，存放图片，并推送成功。