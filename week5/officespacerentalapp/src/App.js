import React from 'react';
import officeImg from './office.png'; 

function App() {

  const officeDetails = {
    Name: "DBS Office Business Center",
    Rent: 55000,
    Address: "123 Main Street, Chennai"
  };

 
  const officeList = [
    { Name: "Smartworks Corporate Space", Rent: 65000, Address: "Guindy, Chennai" },
    { Name: "Regus Shared Workspace", Rent: 48000, Address: "OMR, Chennai" },
    { Name: "WeWork Coworking Office", Rent: 72000, Address: "T-Nagar, Chennai" },
    { Name: "Indiqube Alpha Campus", Rent: 59000, Address: "Perungudi, Chennai" }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif', marginLeft: '30vw', marginRight: '30vw' }}>
      

      <h1>Office Space Rental Application</h1>
  
      <img 
        src={officeImg} 
        alt="Office Space" 
        style={{ width: '350px', height: '200px', marginBottom: '10px' , marginLeft:'6.5vw'}} 
      />

      <p>
        Name: {officeDetails.Name}<br></br> <br></br>
        Rent:{' '}
        <span style={{ color: officeDetails.Rent < 60000 ? 'red' : 'green' }}>
          Rs.{officeDetails.Rent}
        </span>
        <br></br> <br></br>
        Address: {officeDetails.Address}
        <hr></hr>
      </p>

      <div>
        {officeList.map((office, index) => {
          return (
            <p key={index}>
              Name: {office.Name},<br></br> <br></br>
              Rent:{' '}
              <span style={{ color: office.Rent < 60000 ? 'red' : 'green' }}>
                Rs.{office.Rent}
              </span><br></br><br></br>

               Address: {office.Address}
               <hr></hr>
            </p>
          );
        })}
      </div>

    </div>
  );
}

export default App;