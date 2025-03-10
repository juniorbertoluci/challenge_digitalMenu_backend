CREATE TABLE foods(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    image VARCHAR(200) NOT NULL,
    price INTEGER NOT NULL
);