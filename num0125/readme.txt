字符串想不想等
s1.equals(s2)
不相等
if(s1.equals(s2)==false)

 String s3 = s.replaceAll("[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "");
//字符串去掉

StringBuffer sb = new StringBuffer();
        if(s4!=null){
            for(int i=0;i<s4.length();i++){
                char c = s4.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(Character.toLowerCase(c));
                }
                else{
                    sb.append(c);
                }

            }
        }

        String s2=sb.toString();
//大写转小写
