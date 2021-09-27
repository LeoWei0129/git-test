package com.micron.git;

/**
 * 剛創建項目時，右鍵點擊項目，不會有Git選項，代表Git尚未管理這個項目
 * 在最上方的工具列中，找到"VCS"，VCS->Import into Version Control->Create Git Repository，將該項目進行Git初始化(git
 * repository)，初始化後，就可以在該項目的目錄下，找到.git/目錄，代表Git已開始管理這個項目
 * 無論文件顯示列(上面)的文件名是甚麼顏色(red or green，代表git status)，都不會影響代碼執行
 * 可以直接右鍵點擊項目(git-test)，將項目下的所有代碼添加到暫存區和本地庫
 * 使用Idea裡提供的git add功能後(右鍵點擊目標項目/文件->Git->Add)，文件就會存red->green，代表已將文件添加到暫存區
 * 接著再右鍵點擊目標項目/文件->Git->Commit Directory，將項目/文件提交到本地庫
 * 提交後，項目下的文件/該文件的顏色會變成black，代表提交成功
 */
public class GitTest {
    // psvm
    public static void main(String[] args) {
        // soyt
        System.out.println("hello git!");
    }
}