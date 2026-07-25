import React from 'react';

export function ListofPlayers(props) {
  const players = props.players;
  return (
    <ul>
      {players.map((item, index) => {
        return (
          <div key={index}>
            <li>Mr. {item.name}<span> {item.score} </span></li>
          </div>
        );
      })}
    </ul>
  );
}

export function Scorebelow70(props) {
  const players = props.players;
  const players70 = [];

  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
    return null;
  });

  return (
    <ul>
      {players70.map((item, index) => (
        <div key={index}>
          <li>Mr. {item.name}<span> {item.score} </span></li>
        </div>
      ))}
    </ul>
  );
}