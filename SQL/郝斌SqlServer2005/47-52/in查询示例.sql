select * from emp where sal in (1500, 3000, 5000)
�ȼ���
select * from emp 
	where sal=1500 or sal=3000 or sal=5000

select * from emp where sal not in (1500, 3000, 5000) --��sal�Ȳ���1500 Ҳ����3000Ҳ����5000�ļ�¼���
�ȼ���
select * from emp 
	where sal<>1500 and sal<>3000 and sal<>5000
		--���ݿ��в����������ֱ�ʾ��  !=    <>   �Ƽ�ʹ�õڶ���
		--�Ի�ȡ���ǲ���  �Բ���ȡ���ǻ�



	