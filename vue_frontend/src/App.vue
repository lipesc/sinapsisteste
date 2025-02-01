<script setup>
import HelloWorld from './components/HelloWorld.vue'
import { ref } from 'vue';
import { useToast } from "vue-toastification";

const toast = useToast();
const msg = ref('');
const spring = async () => {        
    try {
		await fetch('http://localhost:5000/api')        
		        .then(response => response.json())        
		        .then(data => msg.value = data.msg);
				toast.success("success get msg from spring ***", {
				        timeout: 2000});
	} catch (error) {
		toast.error(error.message);
	}
};
spring();

const count = ref(0);
</script>

<template>
  <div>
    <a href="https://vite.dev" target="_blank">
      <img src="/vite.svg" class="logo" alt="Vite logo" />
    </a>
    <a href="https://vuejs.org/" target="_blank">
      <img src="./assets/vue.svg" class="logo vue" alt="Vue logo" />
    </a>
  </div>
  <HelloWorld :msg="msg" />
</template>

<style scoped>
.logo {
  height: 6em;
  text-size-adjust: 18px;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
