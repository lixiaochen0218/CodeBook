try {
            byte[] name = Base64.getEncoder().encode("hello World".getBytes());
            System.out.println(name.toString()+"hello64");
            byte[] decodedString = Base64.getDecoder().decode(new String(aa).getBytes("UTF-8"));
            System.out.println(new String(decodedString));
} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

code = code.substring(code.indexOf(',')+1);
System.out.println("name = [" + name + "], code = [" + code + "]");
byte[] file = Base64.getDecoder().decode(new String(code).getBytes("UTF-8"));

FileOutputStream stream = new FileOutputStream("newfile.csv");
try {
	stream.write(file);
} finally {
	stream.close();
}