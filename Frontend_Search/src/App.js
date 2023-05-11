import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [searchValue, setSearchValue] = useState("");
  const [Books, setBook] = useState([]);
  const [count,setCount] = useState("");

  useEffect(() => {
    const fetchContacts = async () => {
      const response = await fetch(`http://localhost:8080/api/v2/bookData/search?keyword=${searchValue}`);
      const data = await response.json();
      setBook(data.results); 
      setCount(data.count);
      console.log(data.results, "data"); 
    };
    
    fetchContacts();
}, [searchValue]);

console.log(Books, "book");

const handleSearchChange = (e) => {
  setSearchValue(e.target.value);
}

  return (
    <div className="App">
            <div className='content'>
                <h2>Search</h2>
                <input type='search' placeholder='Seach fot the book here' value={searchValue} 
                onChange={handleSearchChange} className="search-input" />
                <p>{count}</p>
                <ul className="contact-list">
                    {Books.map((book) => (
                        <li key={book.id} className="contact">
                            <div>{book.title}   {book.description} <br />
                             {book.dateCreated} </div>
                        </li>
                    ))}
                </ul>
            </div>
    </div>
  );
}

export default App;
