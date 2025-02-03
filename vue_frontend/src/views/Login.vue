<template>
	<h1> Login</h1>
	

	<form @submit.prevent="login">
	  <input v-model="email" type="email" placeholder="Email"  />
	  <input v-model="password" type="password" placeholder="password" />
	  <button type="submit">Login</button>
	</form>
	
	
	
</template>

<script setup>
import { useRouter } from 'vue-router';

const router = useRouter();

const login = () => {
	router.push('/lista');
};


</script>

<style scoped>
button {
  padding: 10px 20px;
  font-size: 18px;
  cursor: pointer;
}
</style>