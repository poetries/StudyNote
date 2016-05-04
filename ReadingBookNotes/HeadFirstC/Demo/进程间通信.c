/*
  要点：
        1、文件描述符是一个数字，他代表一条数据流，文件描述符描述的不一定是文件
        2文件描述符序号表示：键盘（0）--标准输入  屏幕（1）--标准输出 屏幕（2）--标准错误  数据库连接（3）--其他进程也可能打开的其他形式的数据流
        3、进程可以重定向自己，用2>来重定向标准错误的原因？因为2是标准错误在描述符中的编号
        4、exit()可以快速借宿程序
        5、所有打开的文件都记录在文件描述符中 通过修改描述符就可以重定向输入和输出
        6、fileno()能在表中查找描述符
        7、dup2()可以用来修改描述符表
        8、waitpid()等待进程结束
        9、父子进程可以用管道通信 父子进程各自使用管道的一端
        10、pipe()函数创建一个管道和两个描述符 一个描述符是管道的读取端，另一个是写入端
        11、可以把标准输入和标准输出重定向到管道
        12、操作系统用信号来控制进程 程序通常用信号来结束 进程收到信号后会进行信号处理器
        13、大部分错误信号的默认处理器会终止程序 可以用sigaction()函数替换处理器
        14、可以用taise()向自己发送信号
        15、间隔定时器发送SIGALRM信号
        16、alarm()函数设置间隔定时器 每个进程只能有一个定时器
        17、不要同时使用sleep()和alarm()
        18、kill命令可以向进程发送信号  kill -KILL一定可以终止进程

*/
